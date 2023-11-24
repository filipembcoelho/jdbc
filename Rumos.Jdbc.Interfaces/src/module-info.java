/**
 * 
 */
/**
 * 
 */
module Rumos.Jdbc.Interfaces {
	requires Rumos.Jdbc.Model;

	exports rumos.jdbc.interfaces to Rumos.Jdbc.Services, Rumos.Jdbc.Data, Rumos.Jdbc.Creator;
}