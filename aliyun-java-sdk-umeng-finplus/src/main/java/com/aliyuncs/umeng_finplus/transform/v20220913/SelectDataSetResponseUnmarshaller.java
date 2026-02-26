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

package com.aliyuncs.umeng_finplus.transform.v20220913;

import com.aliyuncs.umeng_finplus.model.v20220913.SelectDataSetResponse;
import com.aliyuncs.umeng_finplus.model.v20220913.SelectDataSetResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SelectDataSetResponseUnmarshaller {

	public static SelectDataSetResponse unmarshall(SelectDataSetResponse selectDataSetResponse, UnmarshallerContext _ctx) {
		
		selectDataSetResponse.setRequestId(_ctx.stringValue("SelectDataSetResponse.RequestId"));
		selectDataSetResponse.setMsg(_ctx.stringValue("SelectDataSetResponse.Msg"));
		selectDataSetResponse.setCode(_ctx.stringValue("SelectDataSetResponse.Code"));
		selectDataSetResponse.setSuccess(_ctx.booleanValue("SelectDataSetResponse.Success"));

		Data data = new Data();
		data.setName(_ctx.stringValue("SelectDataSetResponse.Data.name"));
		data.setLineNum(_ctx.longValue("SelectDataSetResponse.Data.lineNum"));
		data.setStatus(_ctx.stringValue("SelectDataSetResponse.Data.status"));
		data.setType(_ctx.stringValue("SelectDataSetResponse.Data.type"));
		data.setDatasetId(_ctx.longValue("SelectDataSetResponse.Data.datasetId"));
		data.setCreateTime(_ctx.stringValue("SelectDataSetResponse.Data.createTime"));
		selectDataSetResponse.setData(data);
	 
	 	return selectDataSetResponse;
	}
}