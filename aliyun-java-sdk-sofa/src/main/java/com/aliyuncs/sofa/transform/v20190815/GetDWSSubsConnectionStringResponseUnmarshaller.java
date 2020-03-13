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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.GetDWSSubsConnectionStringResponse;
import com.aliyuncs.sofa.model.v20190815.GetDWSSubsConnectionStringResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDWSSubsConnectionStringResponseUnmarshaller {

	public static GetDWSSubsConnectionStringResponse unmarshall(GetDWSSubsConnectionStringResponse getDWSSubsConnectionStringResponse, UnmarshallerContext _ctx) {
		
		getDWSSubsConnectionStringResponse.setRequestId(_ctx.stringValue("GetDWSSubsConnectionStringResponse.RequestId"));
		getDWSSubsConnectionStringResponse.setResultCode(_ctx.stringValue("GetDWSSubsConnectionStringResponse.ResultCode"));
		getDWSSubsConnectionStringResponse.setResultMessage(_ctx.stringValue("GetDWSSubsConnectionStringResponse.ResultMessage"));

		Data data = new Data();
		data.setClusterUrl(_ctx.stringValue("GetDWSSubsConnectionStringResponse.Data.ClusterUrl"));
		data.setConsumer(_ctx.stringValue("GetDWSSubsConnectionStringResponse.Data.Consumer"));
		data.setGroup(_ctx.stringValue("GetDWSSubsConnectionStringResponse.Data.Group"));
		data.setId(_ctx.longValue("GetDWSSubsConnectionStringResponse.Data.Id"));
		data.setPassword(_ctx.stringValue("GetDWSSubsConnectionStringResponse.Data.Password"));
		data.setTableId(_ctx.stringValue("GetDWSSubsConnectionStringResponse.Data.TableId"));
		getDWSSubsConnectionStringResponse.setData(data);
	 
	 	return getDWSSubsConnectionStringResponse;
	}
}