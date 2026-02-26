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

package com.aliyuncs.eds_aic.transform.v20230930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eds_aic.model.v20230930.DescribeDisplayConfigResponse;
import com.aliyuncs.eds_aic.model.v20230930.DescribeDisplayConfigResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDisplayConfigResponseUnmarshaller {

	public static DescribeDisplayConfigResponse unmarshall(DescribeDisplayConfigResponse describeDisplayConfigResponse, UnmarshallerContext _ctx) {
		
		describeDisplayConfigResponse.setRequestId(_ctx.stringValue("DescribeDisplayConfigResponse.RequestId"));

		List<Data> displayConfigModel = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDisplayConfigResponse.DisplayConfigModel.Length"); i++) {
			Data data = new Data();
			data.setAndroidInstanceId(_ctx.stringValue("DescribeDisplayConfigResponse.DisplayConfigModel["+ i +"].AndroidInstanceId"));
			data.setResolutionHeight(_ctx.integerValue("DescribeDisplayConfigResponse.DisplayConfigModel["+ i +"].ResolutionHeight"));
			data.setResolutionWidth(_ctx.integerValue("DescribeDisplayConfigResponse.DisplayConfigModel["+ i +"].ResolutionWidth"));
			data.setDpi(_ctx.integerValue("DescribeDisplayConfigResponse.DisplayConfigModel["+ i +"].Dpi"));
			data.setFps(_ctx.integerValue("DescribeDisplayConfigResponse.DisplayConfigModel["+ i +"].Fps"));
			data.setLockResolution(_ctx.stringValue("DescribeDisplayConfigResponse.DisplayConfigModel["+ i +"].LockResolution"));

			displayConfigModel.add(data);
		}
		describeDisplayConfigResponse.setDisplayConfigModel(displayConfigModel);
	 
	 	return describeDisplayConfigResponse;
	}
}