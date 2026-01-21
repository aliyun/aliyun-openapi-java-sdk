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

package com.aliyuncs.bsn.transform.v20150512;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.bsn.model.v20150512.GetBsnByResourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBsnByResourceResponseUnmarshaller {

	public static GetBsnByResourceResponse unmarshall(GetBsnByResourceResponse getBsnByResourceResponse, UnmarshallerContext _ctx) {
		

		List<String> datas = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetBsnByResourceResponse.datas.Length"); i++) {
			datas.add(_ctx.stringValue("GetBsnByResourceResponse.datas["+ i +"]"));
		}
		getBsnByResourceResponse.setDatas(datas);
	 
	 	return getBsnByResourceResponse;
	}
}