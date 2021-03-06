package edu.msudenver.cs.jdnss;

/**
 * @author Steve Beaty
 * @version $Id: Zone.java,v 1.20 2011/02/14 16:30:32 drb80 Exp $
 */

import java.util.Vector;

interface Zone
{
    public Vector get (int type, String name);
    public String getName();
}
