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

import com.aliyuncs.datav_outer.model.v20190402.PublishScreenWithSnapshotResponse;
import com.aliyuncs.datav_outer.model.v20190402.PublishScreenWithSnapshotResponse.Screen;
import com.aliyuncs.transform.UnmarshallerContext;


public class PublishScreenWithSnapshotResponseUnmarshaller {

	public static PublishScreenWithSnapshotResponse unmarshall(PublishScreenWithSnapshotResponse publishScreenWithSnapshotResponse, UnmarshallerContext _ctx) {
		
		publishScreenWithSnapshotResponse.setRequestId(_ctx.stringValue("PublishScreenWithSnapshotResponse.RequestId"));
		publishScreenWithSnapshotResponse.setSuccess(_ctx.booleanValue("PublishScreenWithSnapshotResponse.Success"));

		Screen screen = new Screen();
		screen.setToken(_ctx.stringValue("PublishScreenWithSnapshotResponse.Screen.Token"));
		screen.setScreenId(_ctx.integerValue("PublishScreenWithSnapshotResponse.Screen.ScreenId"));
		screen.setSnapshotId(_ctx.integerValue("PublishScreenWithSnapshotResponse.Screen.SnapshotId"));
		publishScreenWithSnapshotResponse.setScreen(screen);
	 
	 	return publishScreenWithSnapshotResponse;
	}
}