/*======================================================================
BaseClob implements a wrapped Clob
Application : SIARD2
Description : BaseClob implements a wrapped Clob
              See https://docs.oracle.com/javase/7/docs/api/java/sql/Clob.html
Platform    : Java 8-10   
------------------------------------------------------------------------
Copyright  : 2019, Enter AG, Rüti ZH, Switzerland
Created    : 02.09.2019, Hartwig Thomas
======================================================================*/
package ch.enterag.utils.jdbc;

import java.io.*;
import java.sql.*;

/*====================================================================*/
/** BaseClob implements a wrapped Clob and serves as a base
 * for derived JDBC wrappers.
 * @author Hartwig Thomas
 */
public abstract class BaseClob
  implements Clob
{
  /** wrapped clob */
  private Clob _clobWrapped = null;
  
  /*------------------------------------------------------------------*/
  /** constructor
   * @param clobWrapped Clob to be wrapped or null. 
   */
  public BaseClob(Clob clobWrapped)
  {
    _clobWrapped = clobWrapped;
  } /* constructor BaseClob */

  @Override
  public long length() throws SQLException
  {
    return _clobWrapped.length();
  }

  @Override
  public String getSubString(long pos, int length) throws SQLException
  {
    return _clobWrapped.getSubString(pos, length);
  }

  @Override
  public Reader getCharacterStream() throws SQLException
  {
    return _clobWrapped.getCharacterStream();
  }

  @Override
  public InputStream getAsciiStream() throws SQLException
  {
    return _clobWrapped.getAsciiStream();
  }

  @Override
  public long position(String searchstr, long start) throws SQLException
  {
    return _clobWrapped.position(searchstr, start);
  }

  @Override
  public long position(Clob searchclob, long start) throws SQLException
  {
    return _clobWrapped.position(searchclob, start);
  }

  @Override
  public int setString(long pos, String str) throws SQLException
  {
    // TODO Auto-generated method stub
    return _clobWrapped.setString(pos, str);
  }

  @Override
  public int setString(long pos, String str, int offset, int len)
    throws SQLException
  {
    return _clobWrapped.setString(pos, str, offset, len);
  }

  @Override
  public OutputStream setAsciiStream(long pos) throws SQLException
  {
    return _clobWrapped.setAsciiStream(pos);
  }

  @Override
  public Writer setCharacterStream(long pos) throws SQLException
  {
    return _clobWrapped.setCharacterStream(pos);
  }

  @Override
  public void truncate(long len) throws SQLException
  {
    _clobWrapped.truncate(len);
  }

  @Override
  public void free() throws SQLException
  {
    _clobWrapped.free();
  }

  @Override
  public Reader getCharacterStream(long pos, long length)
    throws SQLException
  {
    return _clobWrapped.getCharacterStream(pos, length);
  }

} /* BaseClob */
