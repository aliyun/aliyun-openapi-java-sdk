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

package com.aliyuncs.drds.transform.v20171016;

import com.aliyuncs.drds.model.v20171016.DeleteDrdsDBResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteDrdsDBResponseUnmarshaller {

	public static DeleteDrdsDBResponse unmarshall(DeleteDrdsDBResponse deleteDrdsDBResponse, UnmarshallerContext _ctx) {
		
		deleteDrdsDBResponse.setRequestId(_ctx.stringValue("DeleteDrdsDBResponse.RequestId"));
		deleteDrdsDBResponse.setSuccess(_ctx.booleanValue("DeleteDrdsDBResponse.Success"));
	 
	 	return deleteDrdsDBResponse;
	}
}