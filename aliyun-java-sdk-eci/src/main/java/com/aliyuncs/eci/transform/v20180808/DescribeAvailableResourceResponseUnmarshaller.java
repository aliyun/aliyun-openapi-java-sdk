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

package com.aliyuncs.eci.transform.v20180808;

import com.aliyuncs.eci.model.v20180808.DescribeAvailableResourceResponse;
import com.aliyuncs.eci.model.v20180808.DescribeAvailableResourceResponse.AvailableZone;
import com.aliyuncs.eci.model.v20180808.DescribeAvailableResourceResponse.AvailableZone.AvailableResource;
import com.aliyuncs.eci.model.v20180808.DescribeAvailableResourceResponse.AvailableZone.AvailableResource.SupportedResource;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaohui
 * @version 1.3.2
 */
public class DescribeAvailableResourceResponseUnmarshaller {
    public static DescribeAvailableResourceResponse unmarshall(DescribeAvailableResourceResponse describeAvailableResourceResponse, UnmarshallerContext context) {

        describeAvailableResourceResponse.setRequestId(context.stringValue("DescribeAvailableResourceResponse.RequestId"));

        List<AvailableZone> availableZones = new ArrayList<AvailableZone>();
        for (int i = 0; i < context.lengthValue("DescribeAvailableResourceResponse.AvailableZones.Length"); i++) {
            AvailableZone availableZone = new AvailableZone();
            availableZone.setZoneId(context.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].ZoneId"));
            availableZone.setRegionId(context.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].RegionId"));

            List<AvailableResource> availableResources = new ArrayList<AvailableResource>();
            for (int j = 0; j < context.lengthValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].AvailableResources.Length"); j++) {
                AvailableResource availableResource = new AvailableResource();
                availableResource.setType(context.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].AvailableResources["+ j + "].Type"));

                List<SupportedResource> supportedResources = new ArrayList<SupportedResource>();
                for (int k = 0; k < context.lengthValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].AvailableResources["+ j + "].SupportedResources.Length"); k++) {
                    SupportedResource supportedResource = new SupportedResource();
                    supportedResource.setValue(context.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].AvailableResources["+ j + "].SupportedResources["+ k +"].Value"));
                    supportedResource.setStatusCategory(context.stringValue("DescribeAvailableResourceResponse.AvailableZones["+ i +"].AvailableResources["+ j + "].SupportedResources["+ k +"].StatusCategory"));
                    supportedResources.add(supportedResource);
                }

                availableResource.setSupportedResources(supportedResources);

                availableResources.add(availableResource);
            }

            availableZone.setAvailableResources(availableResources);

            availableZones.add(availableZone);
        }

        describeAvailableResourceResponse.setAvailableZones(availableZones);


        return describeAvailableResourceResponse;
    }
}
