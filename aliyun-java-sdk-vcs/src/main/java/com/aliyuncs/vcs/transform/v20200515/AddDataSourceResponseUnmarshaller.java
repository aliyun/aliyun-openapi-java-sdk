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

package com.aliyuncs.vcs.transform.v20200515;

import com.aliyuncs.vcs.model.v20200515.AddDataSourceResponse;
import com.aliyuncs.vcs.model.v20200515.AddDataSourceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddDataSourceResponseUnmarshaller {

	public static AddDataSourceResponse unmarshall(AddDataSourceResponse addDataSourceResponse, UnmarshallerContext _ctx) {
		
		addDataSourceResponse.setMessage(_ctx.stringValue("AddDataSourceResponse.Message"));
		addDataSourceResponse.setCode(_ctx.stringValue("AddDataSourceResponse.Code"));

		Data data = new Data();
		data.setOssPath(_ctx.stringValue("AddDataSourceResponse.Data.OssPath"));
		data.setKafkaTopic(_ctx.stringValue("AddDataSourceResponse.Data.KafkaTopic"));
		data.setDataSourceId(_ctx.stringValue("AddDataSourceResponse.Data.DataSourceId"));
		addDataSourceResponse.setData(data);
	 
	 	return addDataSourceResponse;
	}
}