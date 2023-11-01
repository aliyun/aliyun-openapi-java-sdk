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

package com.aliyuncs.cloud_siem.transform.v20220616;

import com.aliyuncs.cloud_siem.model.v20220616.DescribeEntityInfoResponse;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeEntityInfoResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEntityInfoResponseUnmarshaller {

	public static DescribeEntityInfoResponse unmarshall(DescribeEntityInfoResponse describeEntityInfoResponse, UnmarshallerContext _ctx) {
		
		describeEntityInfoResponse.setRequestId(_ctx.stringValue("DescribeEntityInfoResponse.RequestId"));
		describeEntityInfoResponse.setSuccess(_ctx.booleanValue("DescribeEntityInfoResponse.Success"));
		describeEntityInfoResponse.setCode(_ctx.integerValue("DescribeEntityInfoResponse.Code"));
		describeEntityInfoResponse.setMessage(_ctx.stringValue("DescribeEntityInfoResponse.Message"));

		Data data = new Data();
		data.setEntityId(_ctx.longValue("DescribeEntityInfoResponse.Data.EntityId"));
		data.setEntityType(_ctx.stringValue("DescribeEntityInfoResponse.Data.EntityType"));
		data.setEntityInfo(_ctx.mapValue("DescribeEntityInfoResponse.Data.EntityInfo"));
		data.setTipInfo(_ctx.mapValue("DescribeEntityInfoResponse.Data.TipInfo"));
		describeEntityInfoResponse.setData(data);
	 
	 	return describeEntityInfoResponse;
	}
}