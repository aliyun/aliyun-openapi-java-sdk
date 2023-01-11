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

import com.aliyuncs.umeng_finplus.model.v20220913.SelectDataSet2Response;
import com.aliyuncs.umeng_finplus.model.v20220913.SelectDataSet2Response.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SelectDataSet2ResponseUnmarshaller {

	public static SelectDataSet2Response unmarshall(SelectDataSet2Response selectDataSet2Response, UnmarshallerContext _ctx) {
		
		selectDataSet2Response.setRequestId(_ctx.stringValue("SelectDataSet2Response.RequestId"));
		selectDataSet2Response.setMsg(_ctx.stringValue("SelectDataSet2Response.Msg"));
		selectDataSet2Response.setCode(_ctx.stringValue("SelectDataSet2Response.Code"));
		selectDataSet2Response.setSuccess(_ctx.booleanValue("SelectDataSet2Response.Success"));

		Data data = new Data();
		data.setName(_ctx.stringValue("SelectDataSet2Response.Data.name"));
		data.setLineNum(_ctx.longValue("SelectDataSet2Response.Data.lineNum"));
		data.setStatus(_ctx.stringValue("SelectDataSet2Response.Data.status"));
		data.setType(_ctx.stringValue("SelectDataSet2Response.Data.type"));
		data.setDatasetId(_ctx.longValue("SelectDataSet2Response.Data.datasetId"));
		data.setCreateTime(_ctx.stringValue("SelectDataSet2Response.Data.createTime"));
		selectDataSet2Response.setData(data);
	 
	 	return selectDataSet2Response;
	}
}