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

import com.aliyuncs.vod.model.v20170321.DeleteAttachedMediaResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteAttachedMediaResponseUnmarshaller {

	public static DeleteAttachedMediaResponse unmarshall(DeleteAttachedMediaResponse deleteAttachedMediaResponse, UnmarshallerContext _ctx) {
		
		deleteAttachedMediaResponse.setRequestId(_ctx.stringValue("DeleteAttachedMediaResponse.RequestId"));

		List<String> nonExistMediaIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteAttachedMediaResponse.NonExistMediaIds.Length"); i++) {
			nonExistMediaIds.add(_ctx.stringValue("DeleteAttachedMediaResponse.NonExistMediaIds["+ i +"]"));
		}
		deleteAttachedMediaResponse.setNonExistMediaIds(nonExistMediaIds);
	 
	 	return deleteAttachedMediaResponse;
	}
}