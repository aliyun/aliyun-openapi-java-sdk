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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.BatchCheckDeviceNamesResponse;
import com.aliyuncs.iot.model.v20180120.BatchCheckDeviceNamesResponse.Data;
import com.aliyuncs.iot.model.v20180120.BatchCheckDeviceNamesResponse.Data.InvalidDetailListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchCheckDeviceNamesResponseUnmarshaller {

	public static BatchCheckDeviceNamesResponse unmarshall(BatchCheckDeviceNamesResponse batchCheckDeviceNamesResponse, UnmarshallerContext _ctx) {
		
		batchCheckDeviceNamesResponse.setRequestId(_ctx.stringValue("BatchCheckDeviceNamesResponse.RequestId"));
		batchCheckDeviceNamesResponse.setSuccess(_ctx.booleanValue("BatchCheckDeviceNamesResponse.Success"));
		batchCheckDeviceNamesResponse.setCode(_ctx.stringValue("BatchCheckDeviceNamesResponse.Code"));
		batchCheckDeviceNamesResponse.setErrorMessage(_ctx.stringValue("BatchCheckDeviceNamesResponse.ErrorMessage"));

		Data data = new Data();
		data.setApplyId(_ctx.longValue("BatchCheckDeviceNamesResponse.Data.ApplyId"));

		List<String> invalidDeviceNameList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("BatchCheckDeviceNamesResponse.Data.InvalidDeviceNameList.Length"); i++) {
			invalidDeviceNameList.add(_ctx.stringValue("BatchCheckDeviceNamesResponse.Data.InvalidDeviceNameList["+ i +"]"));
		}
		data.setInvalidDeviceNameList(invalidDeviceNameList);

		List<String> invalidDeviceNicknameList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("BatchCheckDeviceNamesResponse.Data.InvalidDeviceNicknameList.Length"); i++) {
			invalidDeviceNicknameList.add(_ctx.stringValue("BatchCheckDeviceNamesResponse.Data.InvalidDeviceNicknameList["+ i +"]"));
		}
		data.setInvalidDeviceNicknameList(invalidDeviceNicknameList);

		List<String> repeatedDeviceNameList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("BatchCheckDeviceNamesResponse.Data.RepeatedDeviceNameList.Length"); i++) {
			repeatedDeviceNameList.add(_ctx.stringValue("BatchCheckDeviceNamesResponse.Data.RepeatedDeviceNameList["+ i +"]"));
		}
		data.setRepeatedDeviceNameList(repeatedDeviceNameList);

		List<InvalidDetailListItem> invalidDetailList = new ArrayList<InvalidDetailListItem>();
		for (int i = 0; i < _ctx.lengthValue("BatchCheckDeviceNamesResponse.Data.InvalidDetailList.Length"); i++) {
			InvalidDetailListItem invalidDetailListItem = new InvalidDetailListItem();
			invalidDetailListItem.setDeviceName(_ctx.stringValue("BatchCheckDeviceNamesResponse.Data.InvalidDetailList["+ i +"].DeviceName"));
			invalidDetailListItem.setNickName(_ctx.stringValue("BatchCheckDeviceNamesResponse.Data.InvalidDetailList["+ i +"].NickName"));
			invalidDetailListItem.setErrorMsg(_ctx.stringValue("BatchCheckDeviceNamesResponse.Data.InvalidDetailList["+ i +"].ErrorMsg"));

			invalidDetailList.add(invalidDetailListItem);
		}
		data.setInvalidDetailList(invalidDetailList);
		batchCheckDeviceNamesResponse.setData(data);
	 
	 	return batchCheckDeviceNamesResponse;
	}
}