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

package com.aliyuncs.das.transform.v20200116;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.das.model.v20200116.GetAutoScaleInstancePolicyListResponse;
import com.aliyuncs.das.model.v20200116.GetAutoScaleInstancePolicyListResponse.Data;
import com.aliyuncs.das.model.v20200116.GetAutoScaleInstancePolicyListResponse.Data.AutoScaleInstancePolicy;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAutoScaleInstancePolicyListResponseUnmarshaller {

	public static GetAutoScaleInstancePolicyListResponse unmarshall(GetAutoScaleInstancePolicyListResponse getAutoScaleInstancePolicyListResponse, UnmarshallerContext _ctx) {
		
		getAutoScaleInstancePolicyListResponse.setRequestId(_ctx.stringValue("GetAutoScaleInstancePolicyListResponse.RequestId"));
		getAutoScaleInstancePolicyListResponse.setCode(_ctx.stringValue("GetAutoScaleInstancePolicyListResponse.Code"));
		getAutoScaleInstancePolicyListResponse.setMessage(_ctx.stringValue("GetAutoScaleInstancePolicyListResponse.Message"));
		getAutoScaleInstancePolicyListResponse.setSuccess(_ctx.stringValue("GetAutoScaleInstancePolicyListResponse.Success"));

		Data data = new Data();
		data.setPageNo(_ctx.longValue("GetAutoScaleInstancePolicyListResponse.Data.pageNo"));
		data.setPageSize(_ctx.longValue("GetAutoScaleInstancePolicyListResponse.Data.pageSize"));
		data.setTotal(_ctx.longValue("GetAutoScaleInstancePolicyListResponse.Data.total"));

		List<AutoScaleInstancePolicy> list = new ArrayList<AutoScaleInstancePolicy>();
		for (int i = 0; i < _ctx.lengthValue("GetAutoScaleInstancePolicyListResponse.Data.list.Length"); i++) {
			AutoScaleInstancePolicy autoScaleInstancePolicy = new AutoScaleInstancePolicy();
			autoScaleInstancePolicy.setUserId(_ctx.stringValue("GetAutoScaleInstancePolicyListResponse.Data.list["+ i +"].userId"));
			autoScaleInstancePolicy.setInstanceId(_ctx.stringValue("GetAutoScaleInstancePolicyListResponse.Data.list["+ i +"].instanceId"));
			autoScaleInstancePolicy.setEngine(_ctx.stringValue("GetAutoScaleInstancePolicyListResponse.Data.list["+ i +"].engine"));
			autoScaleInstancePolicy.setClassType(_ctx.stringValue("GetAutoScaleInstancePolicyListResponse.Data.list["+ i +"].classType"));
			autoScaleInstancePolicy.setPolicyUuid(_ctx.stringValue("GetAutoScaleInstancePolicyListResponse.Data.list["+ i +"].policyUuid"));
			autoScaleInstancePolicy.setOnOff(_ctx.booleanValue("GetAutoScaleInstancePolicyListResponse.Data.list["+ i +"].onOff"));
			autoScaleInstancePolicy.setScaleType(_ctx.stringValue("GetAutoScaleInstancePolicyListResponse.Data.list["+ i +"].scaleType"));
			autoScaleInstancePolicy.setScaleSettings(_ctx.stringValue("GetAutoScaleInstancePolicyListResponse.Data.list["+ i +"].scaleSettings"));
			autoScaleInstancePolicy.setInstanceAlias(_ctx.stringValue("GetAutoScaleInstancePolicyListResponse.Data.list["+ i +"].instanceAlias"));
			autoScaleInstancePolicy.setInstanceClass(_ctx.stringValue("GetAutoScaleInstancePolicyListResponse.Data.list["+ i +"].instanceClass"));
			autoScaleInstancePolicy.setPolicyName(_ctx.stringValue("GetAutoScaleInstancePolicyListResponse.Data.list["+ i +"].policyName"));
			autoScaleInstancePolicy.setState(_ctx.stringValue("GetAutoScaleInstancePolicyListResponse.Data.list["+ i +"].state"));

			list.add(autoScaleInstancePolicy);
		}
		data.setList(list);
		getAutoScaleInstancePolicyListResponse.setData(data);
	 
	 	return getAutoScaleInstancePolicyListResponse;
	}
}