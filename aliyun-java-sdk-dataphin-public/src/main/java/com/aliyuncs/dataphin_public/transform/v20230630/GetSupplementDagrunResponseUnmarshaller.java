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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.GetSupplementDagrunResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetSupplementDagrunResponse.DagrunInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSupplementDagrunResponseUnmarshaller {

	public static GetSupplementDagrunResponse unmarshall(GetSupplementDagrunResponse getSupplementDagrunResponse, UnmarshallerContext _ctx) {
		
		getSupplementDagrunResponse.setRequestId(_ctx.stringValue("GetSupplementDagrunResponse.RequestId"));
		getSupplementDagrunResponse.setSuccess(_ctx.booleanValue("GetSupplementDagrunResponse.Success"));
		getSupplementDagrunResponse.setHttpStatusCode(_ctx.integerValue("GetSupplementDagrunResponse.HttpStatusCode"));
		getSupplementDagrunResponse.setCode(_ctx.stringValue("GetSupplementDagrunResponse.Code"));
		getSupplementDagrunResponse.setMessage(_ctx.stringValue("GetSupplementDagrunResponse.Message"));

		List<DagrunInfo> dagrunList = new ArrayList<DagrunInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetSupplementDagrunResponse.DagrunList.Length"); i++) {
			DagrunInfo dagrunInfo = new DagrunInfo();
			dagrunInfo.setId(_ctx.stringValue("GetSupplementDagrunResponse.DagrunList["+ i +"].Id"));
			dagrunInfo.setBizDate(_ctx.stringValue("GetSupplementDagrunResponse.DagrunList["+ i +"].BizDate"));
			dagrunInfo.setStatus(_ctx.stringValue("GetSupplementDagrunResponse.DagrunList["+ i +"].Status"));
			dagrunInfo.setStartExecuteTime(_ctx.longValue("GetSupplementDagrunResponse.DagrunList["+ i +"].StartExecuteTime"));
			dagrunInfo.setEndExecuteTime(_ctx.longValue("GetSupplementDagrunResponse.DagrunList["+ i +"].EndExecuteTime"));
			dagrunInfo.setSupplementId(_ctx.stringValue("GetSupplementDagrunResponse.DagrunList["+ i +"].SupplementId"));
			dagrunInfo.setDuration(_ctx.stringValue("GetSupplementDagrunResponse.DagrunList["+ i +"].Duration"));

			dagrunList.add(dagrunInfo);
		}
		getSupplementDagrunResponse.setDagrunList(dagrunList);
	 
	 	return getSupplementDagrunResponse;
	}
}