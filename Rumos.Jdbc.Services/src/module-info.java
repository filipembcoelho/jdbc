
module Rumos.Jdbc.Services {
	requires Rumos.Jdbc.Model;
	requires Rumos.Jdbc.Interfaces;

	exports rumos.jdbc.services.interfaces to Rumos.Jdbc.ConsoleApp, Rumos.Jdbc.Creator;
	exports rumos.jdbc.services to Rumos.Jdbc.Creator;
	exports rumos.jdbc.services.dtos to Rumos.Jdbc.ConsoleApp;
}