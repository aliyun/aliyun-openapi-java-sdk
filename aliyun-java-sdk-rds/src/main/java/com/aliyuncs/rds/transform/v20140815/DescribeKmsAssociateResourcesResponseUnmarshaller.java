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

import com.aliyuncs.rds.model.v20140815.DescribeKmsAssociateResourcesResponse;
import com.aliyuncs.rds.model.v20140815.DescribeKmsAssociateResourcesResponse.DBInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeKmsAssociateResourcesResponseUnmarshaller {

	public static DescribeKmsAssociateResourcesResponse unmarshall(DescribeKmsAssociateResourcesResponse describeKmsAssociateResourcesResponse, UnmarshallerContext _ctx) {
		
		describeKmsAssociateResourcesResponse.setRequestId(_ctx.stringValue("DescribeKmsAssociateResourcesResponse.RequestId"));
		describeKmsAssociateResourcesResponse.setAssociateStatus(_ctx.booleanValue("DescribeKmsAssociateResourcesResponse.AssociateStatus"));

		List<DBInstance> associateDBInstances = new ArrayList<DBInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeKmsAssociateResourcesResponse.AssociateDBInstances.Length"); i++) {
			DBInstance dBInstance = new DBInstance();
			dBInstance.setDBInstanceName(_ctx.stringValue("DescribeKmsAssociateResourcesResponse.AssociateDBInstances["+ i +"].DBInstanceName"));
			dBInstance.setEngine(_ctx.stringValue("DescribeKmsAssociateResourcesResponse.AssociateDBInstances["+ i +"].Engine"));
			dBInstance.setStatus(_ctx.stringValue("DescribeKmsAssociateResourcesResponse.AssociateDBInstances["+ i +"].Status"));
			dBInstance.setKeyUsedBy(_ctx.stringValue("DescribeKmsAssociateResourcesResponse.AssociateDBInstances["+ i +"].KeyUsedBy"));

			associateDBInstances.add(dBInstance);
		}
		describeKmsAssociateResourcesResponse.setAssociateDBInstances(associateDBInstances);
	 
	 	return describeKmsAssociateResourcesResponse;
	}
}