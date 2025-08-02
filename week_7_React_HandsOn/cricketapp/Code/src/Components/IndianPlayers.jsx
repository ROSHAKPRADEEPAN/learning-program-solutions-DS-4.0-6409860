import React from 'react';

const IndianPlayers = () => {
  const allPlayers = ['Sachin1', 'Dhoni2', 'Virat3', 'Rohit4', 'Yuvaraj5', 'Raina6'];

  const oddPlayers = allPlayers.filter((_, index) => index % 2 === 0);
  const evenPlayers = allPlayers.filter((_, index) => index % 2 !== 0);

  const T20Players = ['Mr. First Player', 'Mr. Second Player', 'Mr. Third Player'];
  const RanjiTrophyPlayers = ['Mr. Fourth Player', 'Mr. Fifth Player', 'Mr. Sixth Player'];
  const mergedPlayers = [...T20Players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>Odd Players</h2>
      <ul>
        {oddPlayers.map((player, idx) => (
          <li key={idx}>
            {idx === 0 && 'First'} {idx === 1 && 'Third'} {idx === 2 && 'Fifth'} : {player}
          </li>
        ))}
      </ul><hr />

      <h2>Even Players</h2>
      <ul>
        {evenPlayers.map((player, idx) => (
          <li key={idx}>
            {idx === 0 && 'Second'} {idx === 1 && 'Fourth'} {idx === 2 && 'Sixth'} : {player}
          </li>
        ))}
      </ul><hr />

      <h2>List of Indian Players Merged:</h2>
      <ul>
        {mergedPlayers.map((player, idx) => (
          <li key={idx}>{player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
