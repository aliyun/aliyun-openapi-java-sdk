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

package com.aliyuncs.facebody.transform.v20191230;

import com.aliyuncs.facebody.model.v20191230.EnhanceFaceResponse;
import com.aliyuncs.facebody.model.v20191230.EnhanceFaceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnhanceFaceResponseUnmarshaller {

	public static EnhanceFaceResponse unmarshall(EnhanceFaceResponse enhanceFaceResponse, UnmarshallerContext _ctx) {
		
		enhanceFaceResponse.setRequestId(_ctx.stringValue("EnhanceFaceResponse.RequestId"));

		Data data = new Data();
		data.setImageURL(_ctx.stringValue("EnhanceFaceResponse.Data.ImageURL"));
		enhanceFaceResponse.setData(data);
	 
	 	return enhanceFaceResponse;
	}
}