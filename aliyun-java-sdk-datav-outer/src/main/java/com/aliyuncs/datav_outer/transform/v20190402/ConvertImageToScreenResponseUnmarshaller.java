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

package com.aliyuncs.datav_outer.transform.v20190402;

import com.aliyuncs.datav_outer.model.v20190402.ConvertImageToScreenResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ConvertImageToScreenResponseUnmarshaller {

	public static ConvertImageToScreenResponse unmarshall(ConvertImageToScreenResponse convertImageToScreenResponse, UnmarshallerContext _ctx) {
		
		convertImageToScreenResponse.setRequestId(_ctx.stringValue("ConvertImageToScreenResponse.RequestId"));
		convertImageToScreenResponse.setCharts(_ctx.stringValue("ConvertImageToScreenResponse.Charts"));
		convertImageToScreenResponse.setScreenId(_ctx.stringValue("ConvertImageToScreenResponse.ScreenId"));
	 
	 	return convertImageToScreenResponse;
	}
}