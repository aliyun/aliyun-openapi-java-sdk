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

package com.aliyuncs.sddp.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sddp.model.v20190103.DescribeDocTypesResponse;
import com.aliyuncs.sddp.model.v20190103.DescribeDocTypesResponse.DocType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDocTypesResponseUnmarshaller {

	public static DescribeDocTypesResponse unmarshall(DescribeDocTypesResponse describeDocTypesResponse, UnmarshallerContext _ctx) {
		
		describeDocTypesResponse.setRequestId(_ctx.stringValue("DescribeDocTypesResponse.RequestId"));

		List<DocType> docTypeList = new ArrayList<DocType>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDocTypesResponse.DocTypeList.Length"); i++) {
			DocType docType = new DocType();
			docType.setCode(_ctx.longValue("DescribeDocTypesResponse.DocTypeList["+ i +"].Code"));
			docType.setName(_ctx.stringValue("DescribeDocTypesResponse.DocTypeList["+ i +"].Name"));
			docType.setId(_ctx.longValue("DescribeDocTypesResponse.DocTypeList["+ i +"].Id"));

			docTypeList.add(docType);
		}
		describeDocTypesResponse.setDocTypeList(docTypeList);
	 
	 	return describeDocTypesResponse;
	}
}