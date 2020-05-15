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

import com.aliyuncs.sofa.model.v20190815.CancelDWSSubsTaskResponse;
import com.aliyuncs.sofa.model.v20190815.CancelDWSSubsTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CancelDWSSubsTaskResponseUnmarshaller {

	public static CancelDWSSubsTaskResponse unmarshall(CancelDWSSubsTaskResponse cancelDWSSubsTaskResponse, UnmarshallerContext _ctx) {
		
		cancelDWSSubsTaskResponse.setRequestId(_ctx.stringValue("CancelDWSSubsTaskResponse.RequestId"));
		cancelDWSSubsTaskResponse.setResultCode(_ctx.stringValue("CancelDWSSubsTaskResponse.ResultCode"));
		cancelDWSSubsTaskResponse.setResultMessage(_ctx.stringValue("CancelDWSSubsTaskResponse.ResultMessage"));

		Data data = new Data();
		data.setClusterUrl(_ctx.stringValue("CancelDWSSubsTaskResponse.Data.ClusterUrl"));
		data.setComment(_ctx.stringValue("CancelDWSSubsTaskResponse.Data.Comment"));
		data.setConnectionString(_ctx.stringValue("CancelDWSSubsTaskResponse.Data.ConnectionString"));
		data.setConsumer(_ctx.stringValue("CancelDWSSubsTaskResponse.Data.Consumer"));
		data.setGmtCreate(_ctx.longValue("CancelDWSSubsTaskResponse.Data.GmtCreate"));
		data.setGmtModify(_ctx.longValue("CancelDWSSubsTaskResponse.Data.GmtModify"));
		data.setGroup(_ctx.stringValue("CancelDWSSubsTaskResponse.Data.Group"));
		data.setId(_ctx.longValue("CancelDWSSubsTaskResponse.Data.Id"));
		data.setName(_ctx.stringValue("CancelDWSSubsTaskResponse.Data.Name"));
		data.setStatus(_ctx.stringValue("CancelDWSSubsTaskResponse.Data.Status"));
		data.setTableId(_ctx.stringValue("CancelDWSSubsTaskResponse.Data.TableId"));
		cancelDWSSubsTaskResponse.setData(data);
	 
	 	return cancelDWSSubsTaskResponse;
	}
}