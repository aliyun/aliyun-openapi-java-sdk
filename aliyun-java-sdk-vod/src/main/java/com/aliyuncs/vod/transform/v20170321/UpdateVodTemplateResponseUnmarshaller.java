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

package com.aliyuncs.vod.transform.v20170321;

import com.aliyuncs.vod.model.v20170321.UpdateVodTemplateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateVodTemplateResponseUnmarshaller {

	public static UpdateVodTemplateResponse unmarshall(UpdateVodTemplateResponse updateVodTemplateResponse, UnmarshallerContext context) {
		
		updateVodTemplateResponse.setRequestId(context.stringValue("UpdateVodTemplateResponse.RequestId"));
		updateVodTemplateResponse.setVodTemplateId(context.stringValue("UpdateVodTemplateResponse.VodTemplateId"));
	 
	 	return updateVodTemplateResponse;
	}
}