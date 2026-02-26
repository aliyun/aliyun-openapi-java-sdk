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

import com.aliyuncs.eds_aic.model.v20230930.DeleteImagesResponse;
import com.aliyuncs.eds_aic.model.v20230930.DeleteImagesResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteImagesResponseUnmarshaller {

	public static DeleteImagesResponse unmarshall(DeleteImagesResponse deleteImagesResponse, UnmarshallerContext _ctx) {
		
		deleteImagesResponse.setRequestId(_ctx.stringValue("DeleteImagesResponse.RequestId"));

		Data data = new Data();

		List<String> successDeleteImageIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteImagesResponse.Data.SuccessDeleteImageIds.Length"); i++) {
			successDeleteImageIds.add(_ctx.stringValue("DeleteImagesResponse.Data.SuccessDeleteImageIds["+ i +"]"));
		}
		data.setSuccessDeleteImageIds(successDeleteImageIds);

		List<String> failDeleteImageIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteImagesResponse.Data.FailDeleteImageIds.Length"); i++) {
			failDeleteImageIds.add(_ctx.stringValue("DeleteImagesResponse.Data.FailDeleteImageIds["+ i +"]"));
		}
		data.setFailDeleteImageIds(failDeleteImageIds);
		deleteImagesResponse.setData(data);
	 
	 	return deleteImagesResponse;
	}
}