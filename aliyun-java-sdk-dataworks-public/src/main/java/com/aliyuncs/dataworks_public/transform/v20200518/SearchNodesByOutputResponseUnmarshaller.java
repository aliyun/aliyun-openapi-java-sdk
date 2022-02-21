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

package com.aliyuncs.dataworks_public.transform.v20200518;

import com.aliyuncs.dataworks_public.model.v20200518.SearchNodesByOutputResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchNodesByOutputResponseUnmarshaller {

	public static SearchNodesByOutputResponse unmarshall(SearchNodesByOutputResponse searchNodesByOutputResponse, UnmarshallerContext _ctx) {
		
		searchNodesByOutputResponse.setRequestId(_ctx.stringValue("SearchNodesByOutputResponse.RequestId"));
		searchNodesByOutputResponse.setHttpStatusCode(_ctx.integerValue("SearchNodesByOutputResponse.HttpStatusCode"));
		searchNodesByOutputResponse.setData(_ctx.mapValue("SearchNodesByOutputResponse.Data"));
		searchNodesByOutputResponse.setErrorMessage(_ctx.stringValue("SearchNodesByOutputResponse.ErrorMessage"));
		searchNodesByOutputResponse.setSuccess(_ctx.booleanValue("SearchNodesByOutputResponse.Success"));
		searchNodesByOutputResponse.setErrorCode(_ctx.stringValue("SearchNodesByOutputResponse.ErrorCode"));
	 
	 	return searchNodesByOutputResponse;
	}
}