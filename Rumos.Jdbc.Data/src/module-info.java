
module Rumos.Jdbc.Data {
	requires Rumos.Jdbc.Model;
	requires Rumos.Jdbc.Interfaces;
	requires java.sql;
	exports rumos.jdbc.data.repositories to Rumos.Jdbc.Creator;
}