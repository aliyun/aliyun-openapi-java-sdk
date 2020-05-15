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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.AddMSDdcsGrayDataResponse;
import com.aliyuncs.sofa.model.v20190815.AddMSDdcsGrayDataResponse.PushResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddMSDdcsGrayDataResponseUnmarshaller {

	public static AddMSDdcsGrayDataResponse unmarshall(AddMSDdcsGrayDataResponse addMSDdcsGrayDataResponse, UnmarshallerContext _ctx) {
		
		addMSDdcsGrayDataResponse.setRequestId(_ctx.stringValue("AddMSDdcsGrayDataResponse.RequestId"));

		List<PushResultItem> pushResult = new ArrayList<PushResultItem>();
		for (int i = 0; i < _ctx.lengthValue("AddMSDdcsGrayDataResponse.PushResult.Length"); i++) {
			PushResultItem pushResultItem = new PushResultItem();
			pushResultItem.setHost(_ctx.stringValue("AddMSDdcsGrayDataResponse.PushResult["+ i +"].Host"));
			pushResultItem.setSuccess(_ctx.booleanValue("AddMSDdcsGrayDataResponse.PushResult["+ i +"].Success"));

			pushResult.add(pushResultItem);
		}
		addMSDdcsGrayDataResponse.setPushResult(pushResult);
	 
	 	return addMSDdcsGrayDataResponse;
	}
}