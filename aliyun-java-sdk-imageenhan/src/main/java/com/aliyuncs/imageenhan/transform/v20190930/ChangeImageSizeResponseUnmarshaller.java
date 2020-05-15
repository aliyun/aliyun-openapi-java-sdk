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

import com.aliyuncs.imageenhan.model.v20190930.ChangeImageSizeResponse;
import com.aliyuncs.imageenhan.model.v20190930.ChangeImageSizeResponse.Data;
import com.aliyuncs.imageenhan.model.v20190930.ChangeImageSizeResponse.Data.RetainLocation;
import com.aliyuncs.transform.UnmarshallerContext;


public class ChangeImageSizeResponseUnmarshaller {

	public static ChangeImageSizeResponse unmarshall(ChangeImageSizeResponse changeImageSizeResponse, UnmarshallerContext _ctx) {
		
		changeImageSizeResponse.setRequestId(_ctx.stringValue("ChangeImageSizeResponse.RequestId"));

		Data data = new Data();
		data.setUrl(_ctx.stringValue("ChangeImageSizeResponse.Data.Url"));

		RetainLocation retainLocation = new RetainLocation();
		retainLocation.setX(_ctx.integerValue("ChangeImageSizeResponse.Data.RetainLocation.X"));
		retainLocation.setY(_ctx.integerValue("ChangeImageSizeResponse.Data.RetainLocation.Y"));
		retainLocation.setWidth(_ctx.integerValue("ChangeImageSizeResponse.Data.RetainLocation.Width"));
		retainLocation.setHeight(_ctx.integerValue("ChangeImageSizeResponse.Data.RetainLocation.Height"));
		data.setRetainLocation(retainLocation);
		changeImageSizeResponse.setData(data);
	 
	 	return changeImageSizeResponse;
	}
}