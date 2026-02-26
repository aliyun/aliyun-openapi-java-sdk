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

package com.aliyuncs.adb.transform.v20190315;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.adb.model.v20190315.DescribeRdsAnalysisResourceQuotasResponse;
import com.aliyuncs.adb.model.v20190315.DescribeRdsAnalysisResourceQuotasResponse.DBNodeCategory;
import com.aliyuncs.adb.model.v20190315.DescribeRdsAnalysisResourceQuotasResponse.DBNodeClass;
import com.aliyuncs.adb.model.v20190315.DescribeRdsAnalysisResourceQuotasResponse.DBNodeStorage;
import com.aliyuncs.adb.model.v20190315.DescribeRdsAnalysisResourceQuotasResponse.EngineVersion;
import com.aliyuncs.adb.model.v20190315.DescribeRdsAnalysisResourceQuotasResponse.Mode;
import com.aliyuncs.adb.model.v20190315.DescribeRdsAnalysisResourceQuotasResponse.StorageType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRdsAnalysisResourceQuotasResponseUnmarshaller {

	public static DescribeRdsAnalysisResourceQuotasResponse unmarshall(DescribeRdsAnalysisResourceQuotasResponse describeRdsAnalysisResourceQuotasResponse, UnmarshallerContext _ctx) {
		
		describeRdsAnalysisResourceQuotasResponse.setRequestId(_ctx.stringValue("DescribeRdsAnalysisResourceQuotasResponse.RequestId"));

		List<DBNodeClass> dBNodeClassList = new ArrayList<DBNodeClass>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRdsAnalysisResourceQuotasResponse.DBNodeClassList.Length"); i++) {
			DBNodeClass dBNodeClass = new DBNodeClass();
			dBNodeClass.setValue(_ctx.stringValue("DescribeRdsAnalysisResourceQuotasResponse.DBNodeClassList["+ i +"].Value"));
			dBNodeClass.setText(_ctx.stringValue("DescribeRdsAnalysisResourceQuotasResponse.DBNodeClassList["+ i +"].Text"));

			dBNodeClassList.add(dBNodeClass);
		}
		describeRdsAnalysisResourceQuotasResponse.setDBNodeClassList(dBNodeClassList);

		List<EngineVersion> engineVersionList = new ArrayList<EngineVersion>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRdsAnalysisResourceQuotasResponse.EngineVersionList.Length"); i++) {
			EngineVersion engineVersion = new EngineVersion();
			engineVersion.setValue(_ctx.stringValue("DescribeRdsAnalysisResourceQuotasResponse.EngineVersionList["+ i +"].Value"));
			engineVersion.setText(_ctx.stringValue("DescribeRdsAnalysisResourceQuotasResponse.EngineVersionList["+ i +"].Text"));

			engineVersionList.add(engineVersion);
		}
		describeRdsAnalysisResourceQuotasResponse.setEngineVersionList(engineVersionList);

		List<Mode> modeList = new ArrayList<Mode>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRdsAnalysisResourceQuotasResponse.ModeList.Length"); i++) {
			Mode mode = new Mode();
			mode.setValue(_ctx.stringValue("DescribeRdsAnalysisResourceQuotasResponse.ModeList["+ i +"].Value"));
			mode.setText(_ctx.stringValue("DescribeRdsAnalysisResourceQuotasResponse.ModeList["+ i +"].Text"));

			modeList.add(mode);
		}
		describeRdsAnalysisResourceQuotasResponse.setModeList(modeList);

		List<StorageType> storageTypeList = new ArrayList<StorageType>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRdsAnalysisResourceQuotasResponse.StorageTypeList.Length"); i++) {
			StorageType storageType = new StorageType();
			storageType.setValue(_ctx.stringValue("DescribeRdsAnalysisResourceQuotasResponse.StorageTypeList["+ i +"].Value"));
			storageType.setText(_ctx.stringValue("DescribeRdsAnalysisResourceQuotasResponse.StorageTypeList["+ i +"].Text"));

			storageTypeList.add(storageType);
		}
		describeRdsAnalysisResourceQuotasResponse.setStorageTypeList(storageTypeList);

		List<DBNodeStorage> dBNodeStorageList = new ArrayList<DBNodeStorage>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRdsAnalysisResourceQuotasResponse.DBNodeStorageList.Length"); i++) {
			DBNodeStorage dBNodeStorage = new DBNodeStorage();
			dBNodeStorage.setValue(_ctx.stringValue("DescribeRdsAnalysisResourceQuotasResponse.DBNodeStorageList["+ i +"].Value"));
			dBNodeStorage.setText(_ctx.stringValue("DescribeRdsAnalysisResourceQuotasResponse.DBNodeStorageList["+ i +"].Text"));

			dBNodeStorageList.add(dBNodeStorage);
		}
		describeRdsAnalysisResourceQuotasResponse.setDBNodeStorageList(dBNodeStorageList);

		List<DBNodeCategory> dBNodeCategoryList = new ArrayList<DBNodeCategory>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRdsAnalysisResourceQuotasResponse.DBNodeCategoryList.Length"); i++) {
			DBNodeCategory dBNodeCategory = new DBNodeCategory();
			dBNodeCategory.setValue(_ctx.stringValue("DescribeRdsAnalysisResourceQuotasResponse.DBNodeCategoryList["+ i +"].Value"));
			dBNodeCategory.setText(_ctx.stringValue("DescribeRdsAnalysisResourceQuotasResponse.DBNodeCategoryList["+ i +"].Text"));

			dBNodeCategoryList.add(dBNodeCategory);
		}
		describeRdsAnalysisResourceQuotasResponse.setDBNodeCategoryList(dBNodeCategoryList);
	 
	 	return describeRdsAnalysisResourceQuotasResponse;
	}
}