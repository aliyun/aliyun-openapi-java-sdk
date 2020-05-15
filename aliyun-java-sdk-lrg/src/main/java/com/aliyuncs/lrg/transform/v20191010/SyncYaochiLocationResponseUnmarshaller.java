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

package com.aliyuncs.lrg.transform.v20191010;

import com.aliyuncs.lrg.model.v20191010.SyncYaochiLocationResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class SyncYaochiLocationResponseUnmarshaller {

	public static SyncYaochiLocationResponse unmarshall(SyncYaochiLocationResponse syncYaochiLocationResponse, UnmarshallerContext _ctx) {
		
		syncYaochiLocationResponse.setCode(_ctx.integerValue("SyncYaochiLocationResponse.code"));
		syncYaochiLocationResponse.setData(_ctx.mapValue("SyncYaochiLocationResponse.data"));
		syncYaochiLocationResponse.setMessage(_ctx.stringValue("SyncYaochiLocationResponse.message"));
		syncYaochiLocationResponse.setSuccess(_ctx.booleanValue("SyncYaochiLocationResponse.success"));
	 
	 	return syncYaochiLocationResponse;
	}
}