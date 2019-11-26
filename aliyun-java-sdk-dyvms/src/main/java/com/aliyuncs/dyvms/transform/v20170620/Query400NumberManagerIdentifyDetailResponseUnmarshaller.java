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

package com.aliyuncs.dyvms.transform.v20170620;

import com.aliyuncs.dyvms.model.v20170620.Query400NumberManagerIdentifyDetailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class Query400NumberManagerIdentifyDetailResponseUnmarshaller {

	public static Query400NumberManagerIdentifyDetailResponse unmarshall(Query400NumberManagerIdentifyDetailResponse query400NumberManagerIdentifyDetailResponse, UnmarshallerContext _ctx) {
		
		query400NumberManagerIdentifyDetailResponse.setRequestId(_ctx.stringValue("Query400NumberManagerIdentifyDetailResponse.RequestId"));
		query400NumberManagerIdentifyDetailResponse.setCode(_ctx.stringValue("Query400NumberManagerIdentifyDetailResponse.code"));
		query400NumberManagerIdentifyDetailResponse.setData(_ctx.stringValue("Query400NumberManagerIdentifyDetailResponse.data"));
	 
	 	return query400NumberManagerIdentifyDetailResponse;
	}
}