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

import com.aliyuncs.vod.model.v20170321.DeleteMezzaninesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteMezzaninesResponseUnmarshaller {

	public static DeleteMezzaninesResponse unmarshall(DeleteMezzaninesResponse deleteMezzaninesResponse, UnmarshallerContext _ctx) {
		
		deleteMezzaninesResponse.setRequestId(_ctx.stringValue("DeleteMezzaninesResponse.RequestId"));

		List<String> nonExistVideoIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteMezzaninesResponse.NonExistVideoIds.Length"); i++) {
			nonExistVideoIds.add(_ctx.stringValue("DeleteMezzaninesResponse.NonExistVideoIds["+ i +"]"));
		}
		deleteMezzaninesResponse.setNonExistVideoIds(nonExistVideoIds);

		List<String> unRemoveableVideoIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteMezzaninesResponse.UnRemoveableVideoIds.Length"); i++) {
			unRemoveableVideoIds.add(_ctx.stringValue("DeleteMezzaninesResponse.UnRemoveableVideoIds["+ i +"]"));
		}
		deleteMezzaninesResponse.setUnRemoveableVideoIds(unRemoveableVideoIds);
	 
	 	return deleteMezzaninesResponse;
	}
}