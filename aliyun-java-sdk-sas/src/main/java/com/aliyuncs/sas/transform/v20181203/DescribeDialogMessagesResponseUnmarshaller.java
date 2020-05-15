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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeDialogMessagesResponse;
import com.aliyuncs.sas.model.v20181203.DescribeDialogMessagesResponse.AegisDynamicDialogDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDialogMessagesResponseUnmarshaller {

	public static DescribeDialogMessagesResponse unmarshall(DescribeDialogMessagesResponse describeDialogMessagesResponse, UnmarshallerContext _ctx) {
		
		describeDialogMessagesResponse.setRequestId(_ctx.stringValue("DescribeDialogMessagesResponse.RequestId"));
		describeDialogMessagesResponse.setTotalCount(_ctx.integerValue("DescribeDialogMessagesResponse.TotalCount"));

		List<AegisDynamicDialogDTO> dialogList = new ArrayList<AegisDynamicDialogDTO>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDialogMessagesResponse.DialogList.Length"); i++) {
			AegisDynamicDialogDTO aegisDynamicDialogDTO = new AegisDynamicDialogDTO();
			aegisDynamicDialogDTO.setID(_ctx.longValue("DescribeDialogMessagesResponse.DialogList["+ i +"].ID"));
			aegisDynamicDialogDTO.setDialogKey(_ctx.stringValue("DescribeDialogMessagesResponse.DialogList["+ i +"].DialogKey"));
			aegisDynamicDialogDTO.setParams(_ctx.stringValue("DescribeDialogMessagesResponse.DialogList["+ i +"].Params"));

			dialogList.add(aegisDynamicDialogDTO);
		}
		describeDialogMessagesResponse.setDialogList(dialogList);
	 
	 	return describeDialogMessagesResponse;
	}
}