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

import com.aliyuncs.datav_outer.model.v20190402.BatchCreateScreensByTemplatesResponse;
import com.aliyuncs.datav_outer.model.v20190402.BatchCreateScreensByTemplatesResponse.ScreensItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchCreateScreensByTemplatesResponseUnmarshaller {

	public static BatchCreateScreensByTemplatesResponse unmarshall(BatchCreateScreensByTemplatesResponse batchCreateScreensByTemplatesResponse, UnmarshallerContext _ctx) {
		
		batchCreateScreensByTemplatesResponse.setRequestId(_ctx.stringValue("BatchCreateScreensByTemplatesResponse.RequestId"));

		List<ScreensItem> screens = new ArrayList<ScreensItem>();
		for (int i = 0; i < _ctx.lengthValue("BatchCreateScreensByTemplatesResponse.Screens.Length"); i++) {
			ScreensItem screensItem = new ScreensItem();
			screensItem.setScreenId(_ctx.integerValue("BatchCreateScreensByTemplatesResponse.Screens["+ i +"].ScreenId"));
			screensItem.setName(_ctx.stringValue("BatchCreateScreensByTemplatesResponse.Screens["+ i +"].Name"));
			screensItem.setThumbnail(_ctx.stringValue("BatchCreateScreensByTemplatesResponse.Screens["+ i +"].Thumbnail"));

			screens.add(screensItem);
		}
		batchCreateScreensByTemplatesResponse.setScreens(screens);
	 
	 	return batchCreateScreensByTemplatesResponse;
	}
}