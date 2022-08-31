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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeGadInstancesResponse;
import com.aliyuncs.rds.model.v20140815.DescribeGadInstancesResponse.GadInstancesItem;
import com.aliyuncs.rds.model.v20140815.DescribeGadInstancesResponse.GadInstancesItem.GadInstanceMembersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGadInstancesResponseUnmarshaller {

	public static DescribeGadInstancesResponse unmarshall(DescribeGadInstancesResponse describeGadInstancesResponse, UnmarshallerContext _ctx) {
		
		describeGadInstancesResponse.setRequestId(_ctx.stringValue("DescribeGadInstancesResponse.RequestId"));

		List<GadInstancesItem> gadInstances = new ArrayList<GadInstancesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGadInstancesResponse.GadInstances.Length"); i++) {
			GadInstancesItem gadInstancesItem = new GadInstancesItem();
			gadInstancesItem.setGadInstanceName(_ctx.stringValue("DescribeGadInstancesResponse.GadInstances["+ i +"].GadInstanceName"));
			gadInstancesItem.setDescription(_ctx.stringValue("DescribeGadInstancesResponse.GadInstances["+ i +"].Description"));
			gadInstancesItem.setStatus(_ctx.stringValue("DescribeGadInstancesResponse.GadInstances["+ i +"].Status"));
			gadInstancesItem.setCreationTime(_ctx.stringValue("DescribeGadInstancesResponse.GadInstances["+ i +"].CreationTime"));
			gadInstancesItem.setModificationTime(_ctx.stringValue("DescribeGadInstancesResponse.GadInstances["+ i +"].ModificationTime"));
			gadInstancesItem.setService(_ctx.stringValue("DescribeGadInstancesResponse.GadInstances["+ i +"].Service"));

			List<GadInstanceMembersItem> gadInstanceMembers = new ArrayList<GadInstanceMembersItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeGadInstancesResponse.GadInstances["+ i +"].GadInstanceMembers.Length"); j++) {
				GadInstanceMembersItem gadInstanceMembersItem = new GadInstanceMembersItem();
				gadInstanceMembersItem.setDBInstanceID(_ctx.stringValue("DescribeGadInstancesResponse.GadInstances["+ i +"].GadInstanceMembers["+ j +"].DBInstanceID"));
				gadInstanceMembersItem.setEngine(_ctx.stringValue("DescribeGadInstancesResponse.GadInstances["+ i +"].GadInstanceMembers["+ j +"].Engine"));
				gadInstanceMembersItem.setEngineVersion(_ctx.stringValue("DescribeGadInstancesResponse.GadInstances["+ i +"].GadInstanceMembers["+ j +"].EngineVersion"));
				gadInstanceMembersItem.setRegionId(_ctx.stringValue("DescribeGadInstancesResponse.GadInstances["+ i +"].GadInstanceMembers["+ j +"].RegionId"));
				gadInstanceMembersItem.setRole(_ctx.stringValue("DescribeGadInstancesResponse.GadInstances["+ i +"].GadInstanceMembers["+ j +"].Role"));
				gadInstanceMembersItem.setStatus(_ctx.stringValue("DescribeGadInstancesResponse.GadInstances["+ i +"].GadInstanceMembers["+ j +"].Status"));
				gadInstanceMembersItem.setDtsInstance(_ctx.stringValue("DescribeGadInstancesResponse.GadInstances["+ i +"].GadInstanceMembers["+ j +"].DtsInstance"));
				gadInstanceMembersItem.setResourceGroupId(_ctx.stringValue("DescribeGadInstancesResponse.GadInstances["+ i +"].GadInstanceMembers["+ j +"].ResourceGroupId"));

				gadInstanceMembers.add(gadInstanceMembersItem);
			}
			gadInstancesItem.setGadInstanceMembers(gadInstanceMembers);

			gadInstances.add(gadInstancesItem);
		}
		describeGadInstancesResponse.setGadInstances(gadInstances);
	 
	 	return describeGadInstancesResponse;
	}
}