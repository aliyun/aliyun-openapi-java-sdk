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

package com.aliyuncs.cloudauth.transform.v20190307;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudauth.model.v20190307.DescribeVerifyRecordsResponse;
import com.aliyuncs.cloudauth.model.v20190307.DescribeVerifyRecordsResponse.Records;
import com.aliyuncs.cloudauth.model.v20190307.DescribeVerifyRecordsResponse.Records.Material;
import com.aliyuncs.cloudauth.model.v20190307.DescribeVerifyRecordsResponse.Records.Material.IdCardInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVerifyRecordsResponseUnmarshaller {

	public static DescribeVerifyRecordsResponse unmarshall(DescribeVerifyRecordsResponse describeVerifyRecordsResponse, UnmarshallerContext _ctx) {
		
		describeVerifyRecordsResponse.setRequestId(_ctx.stringValue("DescribeVerifyRecordsResponse.RequestId"));
		describeVerifyRecordsResponse.setTotalCount(_ctx.integerValue("DescribeVerifyRecordsResponse.TotalCount"));
		describeVerifyRecordsResponse.setPageSize(_ctx.integerValue("DescribeVerifyRecordsResponse.PageSize"));
		describeVerifyRecordsResponse.setCurrentPage(_ctx.integerValue("DescribeVerifyRecordsResponse.CurrentPage"));
		describeVerifyRecordsResponse.setQueryId(_ctx.stringValue("DescribeVerifyRecordsResponse.QueryId"));

		List<Records> recordsList = new ArrayList<Records>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVerifyRecordsResponse.RecordsList.Length"); i++) {
			Records records = new Records();
			records.setBizType(_ctx.stringValue("DescribeVerifyRecordsResponse.RecordsList["+ i +"].BizType"));
			records.setBizId(_ctx.stringValue("DescribeVerifyRecordsResponse.RecordsList["+ i +"].BizId"));
			records.setVerifyId(_ctx.stringValue("DescribeVerifyRecordsResponse.RecordsList["+ i +"].VerifyId"));
			records.setFinishTime(_ctx.longValue("DescribeVerifyRecordsResponse.RecordsList["+ i +"].FinishTime"));
			records.setStatus(_ctx.integerValue("DescribeVerifyRecordsResponse.RecordsList["+ i +"].Status"));
			records.setIdCardFaceComparisonScore(_ctx.floatValue("DescribeVerifyRecordsResponse.RecordsList["+ i +"].IdCardFaceComparisonScore"));
			records.setAuthorityComparisonScore(_ctx.floatValue("DescribeVerifyRecordsResponse.RecordsList["+ i +"].AuthorityComparisonScore"));

			Material material = new Material();
			material.setFaceImageUrl(_ctx.stringValue("DescribeVerifyRecordsResponse.RecordsList["+ i +"].Material.FaceImageUrl"));
			material.setIdCardName(_ctx.stringValue("DescribeVerifyRecordsResponse.RecordsList["+ i +"].Material.IdCardName"));
			material.setIdCardNumber(_ctx.stringValue("DescribeVerifyRecordsResponse.RecordsList["+ i +"].Material.IdCardNumber"));

			IdCardInfo idCardInfo = new IdCardInfo();
			idCardInfo.setFrontImageUrl(_ctx.stringValue("DescribeVerifyRecordsResponse.RecordsList["+ i +"].Material.IdCardInfo.FrontImageUrl"));
			idCardInfo.setBackImageUrl(_ctx.stringValue("DescribeVerifyRecordsResponse.RecordsList["+ i +"].Material.IdCardInfo.BackImageUrl"));
			idCardInfo.setName(_ctx.stringValue("DescribeVerifyRecordsResponse.RecordsList["+ i +"].Material.IdCardInfo.Name"));
			idCardInfo.setNumber(_ctx.stringValue("DescribeVerifyRecordsResponse.RecordsList["+ i +"].Material.IdCardInfo.Number"));
			idCardInfo.setAddress(_ctx.stringValue("DescribeVerifyRecordsResponse.RecordsList["+ i +"].Material.IdCardInfo.Address"));
			idCardInfo.setBirth(_ctx.stringValue("DescribeVerifyRecordsResponse.RecordsList["+ i +"].Material.IdCardInfo.Birth"));
			idCardInfo.setSex(_ctx.stringValue("DescribeVerifyRecordsResponse.RecordsList["+ i +"].Material.IdCardInfo.Sex"));
			idCardInfo.setNationality(_ctx.stringValue("DescribeVerifyRecordsResponse.RecordsList["+ i +"].Material.IdCardInfo.Nationality"));
			idCardInfo.setAuthority(_ctx.stringValue("DescribeVerifyRecordsResponse.RecordsList["+ i +"].Material.IdCardInfo.Authority"));
			idCardInfo.setStartDate(_ctx.stringValue("DescribeVerifyRecordsResponse.RecordsList["+ i +"].Material.IdCardInfo.StartDate"));
			idCardInfo.setEndDate(_ctx.stringValue("DescribeVerifyRecordsResponse.RecordsList["+ i +"].Material.IdCardInfo.EndDate"));
			material.setIdCardInfo(idCardInfo);
			records.setMaterial(material);

			recordsList.add(records);
		}
		describeVerifyRecordsResponse.setRecordsList(recordsList);
	 
	 	return describeVerifyRecordsResponse;
	}
}