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

import com.aliyuncs.datav_outer.model.v20190402.GetScreenResponse;
import com.aliyuncs.datav_outer.model.v20190402.GetScreenResponse.Screen;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetScreenResponseUnmarshaller {

	public static GetScreenResponse unmarshall(GetScreenResponse getScreenResponse, UnmarshallerContext _ctx) {
		
		getScreenResponse.setRequestId(_ctx.stringValue("GetScreenResponse.RequestId"));

		Screen screen = new Screen();
		screen.setScreenId(_ctx.integerValue("GetScreenResponse.Screen.ScreenId"));
		screen.setName(_ctx.stringValue("GetScreenResponse.Screen.Name"));
		screen.setProjectId(_ctx.integerValue("GetScreenResponse.Screen.ProjectId"));
		screen.setUpdatedAt(_ctx.stringValue("GetScreenResponse.Screen.UpdatedAt"));
		screen.setThumbnail(_ctx.stringValue("GetScreenResponse.Screen.Thumbnail"));
		screen.setConfig(_ctx.stringValue("GetScreenResponse.Screen.Config"));
		screen.setShare(_ctx.stringValue("GetScreenResponse.Screen.Share"));
		screen.setJs(_ctx.stringValue("GetScreenResponse.Screen.Js"));
		screen.setInteraction(_ctx.stringValue("GetScreenResponse.Screen.Interaction"));
		getScreenResponse.setScreen(screen);
	 
	 	return getScreenResponse;
	}
}