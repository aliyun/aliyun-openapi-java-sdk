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

import com.aliyuncs.sofa.model.v20190815.GetDWSSubsTaskResponse;
import com.aliyuncs.sofa.model.v20190815.GetDWSSubsTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDWSSubsTaskResponseUnmarshaller {

	public static GetDWSSubsTaskResponse unmarshall(GetDWSSubsTaskResponse getDWSSubsTaskResponse, UnmarshallerContext _ctx) {
		
		getDWSSubsTaskResponse.setRequestId(_ctx.stringValue("GetDWSSubsTaskResponse.RequestId"));
		getDWSSubsTaskResponse.setResultCode(_ctx.stringValue("GetDWSSubsTaskResponse.ResultCode"));
		getDWSSubsTaskResponse.setResultMessage(_ctx.stringValue("GetDWSSubsTaskResponse.ResultMessage"));

		Data data = new Data();
		data.setClusterUrl(_ctx.stringValue("GetDWSSubsTaskResponse.Data.ClusterUrl"));
		data.setComment(_ctx.stringValue("GetDWSSubsTaskResponse.Data.Comment"));
		data.setConnectionString(_ctx.stringValue("GetDWSSubsTaskResponse.Data.ConnectionString"));
		data.setConsumer(_ctx.stringValue("GetDWSSubsTaskResponse.Data.Consumer"));
		data.setGmtCreate(_ctx.longValue("GetDWSSubsTaskResponse.Data.GmtCreate"));
		data.setGmtModify(_ctx.longValue("GetDWSSubsTaskResponse.Data.GmtModify"));
		data.setGroup(_ctx.stringValue("GetDWSSubsTaskResponse.Data.Group"));
		data.setId(_ctx.longValue("GetDWSSubsTaskResponse.Data.Id"));
		data.setName(_ctx.stringValue("GetDWSSubsTaskResponse.Data.Name"));
		data.setStatus(_ctx.stringValue("GetDWSSubsTaskResponse.Data.Status"));
		data.setTableId(_ctx.stringValue("GetDWSSubsTaskResponse.Data.TableId"));
		getDWSSubsTaskResponse.setData(data);
	 
	 	return getDWSSubsTaskResponse;
	}
}