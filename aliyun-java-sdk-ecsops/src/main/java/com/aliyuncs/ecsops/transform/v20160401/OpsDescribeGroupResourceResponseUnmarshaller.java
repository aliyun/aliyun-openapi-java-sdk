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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeGroupResourceResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeGroupResourceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeGroupResourceResponseUnmarshaller {

	public static OpsDescribeGroupResourceResponse unmarshall(OpsDescribeGroupResourceResponse opsDescribeGroupResourceResponse, UnmarshallerContext _ctx) {
		
		opsDescribeGroupResourceResponse.setRequestId(_ctx.stringValue("OpsDescribeGroupResourceResponse.RequestId"));

		Data data = new Data();
		data.setGroupId(_ctx.longValue("OpsDescribeGroupResourceResponse.Data.GroupId"));
		data.setVpcId(_ctx.stringValue("OpsDescribeGroupResourceResponse.Data.VpcId"));
		data.setGroupNo(_ctx.stringValue("OpsDescribeGroupResourceResponse.Data.GroupNo"));
		data.setGroupDesc(_ctx.stringValue("OpsDescribeGroupResourceResponse.Data.GroupDesc"));

		List<String> dirtyVms = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeGroupResourceResponse.Data.DirtyVms.Length"); i++) {
			dirtyVms.add(_ctx.stringValue("OpsDescribeGroupResourceResponse.Data.DirtyVms["+ i +"]"));
		}
		data.setDirtyVms(dirtyVms);
		opsDescribeGroupResourceResponse.setData(data);
	 
	 	return opsDescribeGroupResourceResponse;
	}
}