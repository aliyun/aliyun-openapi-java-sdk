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

package com.aliyuncs.imageenhan.transform.v20190930;

import com.aliyuncs.imageenhan.model.v20190930.ErasePersonResponse;
import com.aliyuncs.imageenhan.model.v20190930.ErasePersonResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ErasePersonResponseUnmarshaller {

	public static ErasePersonResponse unmarshall(ErasePersonResponse erasePersonResponse, UnmarshallerContext _ctx) {
		
		erasePersonResponse.setRequestId(_ctx.stringValue("ErasePersonResponse.RequestId"));

		Data data = new Data();
		data.setImageUrl(_ctx.stringValue("ErasePersonResponse.Data.ImageUrl"));
		erasePersonResponse.setData(data);
	 
	 	return erasePersonResponse;
	}
}