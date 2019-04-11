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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.MoveAppResourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class MoveAppResourceResponseUnmarshaller {

	public static MoveAppResourceResponse unmarshall(MoveAppResourceResponse moveAppResourceResponse, UnmarshallerContext context) {
		
		moveAppResourceResponse.setRequestId(context.stringValue("MoveAppResourceResponse.RequestId"));

		List<String> nonExistResourceIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("MoveAppResourceResponse.NonExistResourceIds.Length"); i++) {
			nonExistResourceIds.add(context.stringValue("MoveAppResourceResponse.NonExistResourceIds["+ i +"]"));
		}
		moveAppResourceResponse.setNonExistResourceIds(nonExistResourceIds);

		List<String> failedResourceIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("MoveAppResourceResponse.FailedResourceIds.Length"); i++) {
			failedResourceIds.add(context.stringValue("MoveAppResourceResponse.FailedResourceIds["+ i +"]"));
		}
		moveAppResourceResponse.setFailedResourceIds(failedResourceIds);
	 
	 	return moveAppResourceResponse;
	}
}