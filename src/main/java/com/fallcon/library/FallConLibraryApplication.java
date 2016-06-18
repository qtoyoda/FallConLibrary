
package com.fallcon.library;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import com.fallcon.library.resources.HelloResource;


public class FallConLibraryApplication extends Application<FallConLibraryConfiguration>
{

    public static void main(String[] args) throws Exception {
        new FallConLibraryApplication().run(args);
    }


    /**
     * @see io.dropwizard.Application#run(io.dropwizard.Configuration,
     *      io.dropwizard.setup.Environment)
     */
    @Override
    public void run( FallConLibraryConfiguration configuration, Environment environment )
        throws Exception
    {
        environment.jersey().register( new HelloResource() );
    }


    @Override
    public String getName()
    {
        return "hello-world";
    }

}
