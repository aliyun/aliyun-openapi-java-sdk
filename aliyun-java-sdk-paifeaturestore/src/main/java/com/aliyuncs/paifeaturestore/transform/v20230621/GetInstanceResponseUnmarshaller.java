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

package com.aliyuncs.paifeaturestore.transform.v20230621;

import com.aliyuncs.paifeaturestore.model.v20230621.GetInstanceResponse;
import com.aliyuncs.paifeaturestore.model.v20230621.GetInstanceResponse.FeatureDBInstanceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceResponseUnmarshaller {

	public static GetInstanceResponse unmarshall(GetInstanceResponse getInstanceResponse, UnmarshallerContext _ctx) {
		
		getInstanceResponse.setRequestId(_ctx.stringValue("GetInstanceResponse.RequestId"));
		getInstanceResponse.setStatus(_ctx.stringValue("GetInstanceResponse.Status"));
		getInstanceResponse.setRegionId(_ctx.stringValue("GetInstanceResponse.RegionId"));
		getInstanceResponse.setGmtCreateTime(_ctx.stringValue("GetInstanceResponse.GmtCreateTime"));
		getInstanceResponse.setGmtModifiedTime(_ctx.stringValue("GetInstanceResponse.GmtModifiedTime"));
		getInstanceResponse.setProgress(_ctx.doubleValue("GetInstanceResponse.Progress"));
		getInstanceResponse.setMessage(_ctx.stringValue("GetInstanceResponse.Message"));
		getInstanceResponse.setType(_ctx.stringValue("GetInstanceResponse.Type"));

		FeatureDBInstanceInfo featureDBInstanceInfo = new FeatureDBInstanceInfo();
		featureDBInstanceInfo.setStatus(_ctx.stringValue("GetInstanceResponse.FeatureDBInstanceInfo.Status"));
		getInstanceResponse.setFeatureDBInstanceInfo(featureDBInstanceInfo);
	 
	 	return getInstanceResponse;
	}
}