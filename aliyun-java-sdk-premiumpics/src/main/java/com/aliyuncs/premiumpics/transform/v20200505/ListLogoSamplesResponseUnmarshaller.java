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

package com.aliyuncs.premiumpics.transform.v20200505;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.premiumpics.model.v20200505.ListLogoSamplesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLogoSamplesResponseUnmarshaller {

	public static ListLogoSamplesResponse unmarshall(ListLogoSamplesResponse listLogoSamplesResponse, UnmarshallerContext _ctx) {
		
		listLogoSamplesResponse.setRequestId(_ctx.stringValue("ListLogoSamplesResponse.RequestId"));
		listLogoSamplesResponse.setSuccess(_ctx.booleanValue("ListLogoSamplesResponse.Success"));

		List<String> images = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListLogoSamplesResponse.Images.Length"); i++) {
			images.add(_ctx.stringValue("ListLogoSamplesResponse.Images["+ i +"]"));
		}
		listLogoSamplesResponse.setImages(images);
	 
	 	return listLogoSamplesResponse;
	}
}