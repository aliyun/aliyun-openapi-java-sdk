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

package com.aliyuncs.dts.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dts.model.v20200101.PreviewSqlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PreviewSqlResponseUnmarshaller {

	public static PreviewSqlResponse unmarshall(PreviewSqlResponse previewSqlResponse, UnmarshallerContext _ctx) {
		
		previewSqlResponse.setRequestId(_ctx.stringValue("PreviewSqlResponse.RequestId"));
		previewSqlResponse.setDynamicCode(_ctx.stringValue("PreviewSqlResponse.DynamicCode"));
		previewSqlResponse.setDynamicMessage(_ctx.stringValue("PreviewSqlResponse.DynamicMessage"));
		previewSqlResponse.setErrCode(_ctx.stringValue("PreviewSqlResponse.ErrCode"));
		previewSqlResponse.setErrMessage(_ctx.stringValue("PreviewSqlResponse.ErrMessage"));
		previewSqlResponse.setHttpStatusCode(_ctx.integerValue("PreviewSqlResponse.HttpStatusCode"));
		previewSqlResponse.setSuccess(_ctx.booleanValue("PreviewSqlResponse.Success"));
		previewSqlResponse.setStreamGraph(_ctx.stringValue("PreviewSqlResponse.StreamGraph"));
		previewSqlResponse.setValidationException(_ctx.stringValue("PreviewSqlResponse.ValidationException"));

		List<String> sqlList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("PreviewSqlResponse.SqlList.Length"); i++) {
			sqlList.add(_ctx.stringValue("PreviewSqlResponse.SqlList["+ i +"]"));
		}
		previewSqlResponse.setSqlList(sqlList);
	 
	 	return previewSqlResponse;
	}
}