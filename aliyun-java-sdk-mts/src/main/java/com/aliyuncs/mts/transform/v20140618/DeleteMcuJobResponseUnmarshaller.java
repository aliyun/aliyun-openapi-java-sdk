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

package com.aliyuncs.mts.transform.v20140618;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.DeleteMcuJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteMcuJobResponseUnmarshaller {

	public static DeleteMcuJobResponse unmarshall(DeleteMcuJobResponse deleteMcuJobResponse, UnmarshallerContext context) {
		
		deleteMcuJobResponse.setRequestId(context.stringValue("DeleteMcuJobResponse.RequestId"));

		List<String> nonExistJobIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DeleteMcuJobResponse.NonExistJobIds.Length"); i++) {
			nonExistJobIds.add(context.stringValue("DeleteMcuJobResponse.NonExistJobIds["+ i +"]"));
		}
		deleteMcuJobResponse.setNonExistJobIds(nonExistJobIds);

		List<String> deletedJobIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DeleteMcuJobResponse.DeletedJobIds.Length"); i++) {
			deletedJobIds.add(context.stringValue("DeleteMcuJobResponse.DeletedJobIds["+ i +"]"));
		}
		deleteMcuJobResponse.setDeletedJobIds(deletedJobIds);
	 
	 	return deleteMcuJobResponse;
	}
}