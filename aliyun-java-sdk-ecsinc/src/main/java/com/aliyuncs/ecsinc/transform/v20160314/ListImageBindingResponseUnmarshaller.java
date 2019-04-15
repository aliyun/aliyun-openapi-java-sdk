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

package com.aliyuncs.ecsinc.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsinc.model.v20160314.ListImageBindingResponse;
import com.aliyuncs.ecsinc.model.v20160314.ListImageBindingResponse.ImageBinding;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListImageBindingResponseUnmarshaller {

	public static ListImageBindingResponse unmarshall(ListImageBindingResponse listImageBindingResponse, UnmarshallerContext context) {
		
		listImageBindingResponse.setRequestId(context.stringValue("ListImageBindingResponse.RequestId"));

		List<ImageBinding> data = new ArrayList<ImageBinding>();
		for (int i = 0; i < context.lengthValue("ListImageBindingResponse.data.Length"); i++) {
			ImageBinding imageBinding = new ImageBinding();
			imageBinding.setInstanceId(context.stringValue("ListImageBindingResponse.data["+ i +"].instanceId"));
			imageBinding.setImageId(context.stringValue("ListImageBindingResponse.data["+ i +"].imageId"));
			imageBinding.setImageInstanceId(context.stringValue("ListImageBindingResponse.data["+ i +"].imageInstanceId"));
			imageBinding.setRegionNo(context.stringValue("ListImageBindingResponse.data["+ i +"].regionNo"));
			imageBinding.setImagePc(context.stringValue("ListImageBindingResponse.data["+ i +"].imagePc"));
			imageBinding.setBindTime(context.longValue("ListImageBindingResponse.data["+ i +"].bindTime"));
			imageBinding.setChargeType(context.stringValue("ListImageBindingResponse.data["+ i +"].chargeType"));

			data.add(imageBinding);
		}
		listImageBindingResponse.setData(data);
	 
	 	return listImageBindingResponse;
	}
}