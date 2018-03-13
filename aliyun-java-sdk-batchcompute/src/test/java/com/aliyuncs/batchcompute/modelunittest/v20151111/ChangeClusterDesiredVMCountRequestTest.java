/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.batchcompute.modelunittest.v20151111;


import com.aliyuncs.batchcompute.model.v20151111.ChangeClusterDesiredVMCountRequest;
import com.aliyuncs.batchcompute.pojo.v20151111.ClusterDescription;
import com.aliyuncs.batchcompute.pojo.v20151111.GroupDescription;
import com.aliyuncs.exceptions.ClientException;
import junit.framework.TestCase;
import org.junit.Test;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by guangchun.luo on 15/4/14.
 */
public class ChangeClusterDesiredVMCountRequestTest extends TestCase {


    @Test
    public void testSetContent() throws NoSuchAlgorithmException, IOException, ClientException {
        ChangeClusterDesiredVMCountRequest req = new ChangeClusterDesiredVMCountRequest();
        String clusterId = "cls-xxx123";

        GroupDescription group1 = new GroupDescription();
        group1.setDesiredVMCount(3);
        ClusterDescription desc = new ClusterDescription();
        desc.addGroup("group1", group1);

        req.setClusterId(clusterId);
        req.setClusterDescription(desc);

        assertEquals(req.getClusterId(), clusterId);
        assertEquals(req.getClusterDescription().getGroups().get("group1").getDesiredVMCount(), 3);

    }

}
