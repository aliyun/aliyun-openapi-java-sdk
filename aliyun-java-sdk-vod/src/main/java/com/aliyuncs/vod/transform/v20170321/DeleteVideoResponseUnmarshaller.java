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

import com.aliyuncs.vod.model.v20170321.DeleteVideoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteVideoResponseUnmarshaller {

	public static DeleteVideoResponse unmarshall(DeleteVideoResponse deleteVideoResponse, UnmarshallerContext _ctx) {
		
		deleteVideoResponse.setRequestId(_ctx.stringValue("DeleteVideoResponse.RequestId"));

		List<String> nonExistVideoIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteVideoResponse.NonExistVideoIds.Length"); i++) {
			nonExistVideoIds.add(_ctx.stringValue("DeleteVideoResponse.NonExistVideoIds["+ i +"]"));
		}
		deleteVideoResponse.setNonExistVideoIds(nonExistVideoIds);

		List<String> forbiddenVideoIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteVideoResponse.ForbiddenVideoIds.Length"); i++) {
			forbiddenVideoIds.add(_ctx.stringValue("DeleteVideoResponse.ForbiddenVideoIds["+ i +"]"));
		}
		deleteVideoResponse.setForbiddenVideoIds(forbiddenVideoIds);
	 
	 	return deleteVideoResponse;
	}
}