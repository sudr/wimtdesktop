/**
 * This file is subject to the terms and conditions defined in file
 * 'LICENSE.txt', which is part of this source code package.
 */
package co.sudr.wimtdsktp.task;

import java.util.Collection;

public class Task
{
    private String name;
    
    private final Collection<Tag> tags;
    
    public Task(final String name, final Collection<Tag> tags)
    {
        this.name = name;
        this.tags = tags;
    }
    
    public String getName()
    {
        return name;
    }
    
    public Collection<Tag> getTags()
    {
        return tags;
    }
    
}
