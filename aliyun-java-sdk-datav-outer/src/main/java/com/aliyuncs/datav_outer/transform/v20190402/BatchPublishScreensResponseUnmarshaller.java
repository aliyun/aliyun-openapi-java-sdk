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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.datav_outer.model.v20190402.BatchPublishScreensResponse;
import com.aliyuncs.datav_outer.model.v20190402.BatchPublishScreensResponse.ScreensItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchPublishScreensResponseUnmarshaller {

	public static BatchPublishScreensResponse unmarshall(BatchPublishScreensResponse batchPublishScreensResponse, UnmarshallerContext _ctx) {
		
		batchPublishScreensResponse.setRequestId(_ctx.stringValue("BatchPublishScreensResponse.RequestId"));

		List<ScreensItem> screens = new ArrayList<ScreensItem>();
		for (int i = 0; i < _ctx.lengthValue("BatchPublishScreensResponse.Screens.Length"); i++) {
			ScreensItem screensItem = new ScreensItem();
			screensItem.setShare(_ctx.stringValue("BatchPublishScreensResponse.Screens["+ i +"].Share"));
			screensItem.setScreenId(_ctx.integerValue("BatchPublishScreensResponse.Screens["+ i +"].ScreenId"));
			screensItem.setSnapshotId(_ctx.integerValue("BatchPublishScreensResponse.Screens["+ i +"].SnapshotId"));
			screensItem.setToken(_ctx.stringValue("BatchPublishScreensResponse.Screens["+ i +"].Token"));

			screens.add(screensItem);
		}
		batchPublishScreensResponse.setScreens(screens);
	 
	 	return batchPublishScreensResponse;
	}
}