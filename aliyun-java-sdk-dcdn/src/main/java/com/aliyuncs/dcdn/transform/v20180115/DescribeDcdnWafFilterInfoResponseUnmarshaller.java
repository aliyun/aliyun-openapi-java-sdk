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

package com.aliyuncs.dcdn.transform.v20180115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnWafFilterInfoResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnWafFilterInfoResponse.FilterInfo;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnWafFilterInfoResponse.FilterInfo.Field;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnWafFilterInfoResponse.FilterInfo.Field.Logic;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnWafFilterInfoResponse.FilterInfo.Field.Logic.Regexp;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnWafFilterInfoResponseUnmarshaller {

	public static DescribeDcdnWafFilterInfoResponse unmarshall(DescribeDcdnWafFilterInfoResponse describeDcdnWafFilterInfoResponse, UnmarshallerContext _ctx) {
		
		describeDcdnWafFilterInfoResponse.setRequestId(_ctx.stringValue("DescribeDcdnWafFilterInfoResponse.RequestId"));

		List<FilterInfo> content = new ArrayList<FilterInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnWafFilterInfoResponse.Content.Length"); i++) {
			FilterInfo filterInfo = new FilterInfo();
			filterInfo.setDefenseScene(_ctx.stringValue("DescribeDcdnWafFilterInfoResponse.Content["+ i +"].DefenseScene"));

			List<Field> fields = new ArrayList<Field>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDcdnWafFilterInfoResponse.Content["+ i +"].Fields.Length"); j++) {
				Field field = new Field();
				field.setExtendField(_ctx.stringValue("DescribeDcdnWafFilterInfoResponse.Content["+ i +"].Fields["+ j +"].ExtendField"));
				field.setMatchField(_ctx.stringValue("DescribeDcdnWafFilterInfoResponse.Content["+ i +"].Fields["+ j +"].MatchField"));

				List<Logic> logicalSymbol = new ArrayList<Logic>();
				for (int k = 0; k < _ctx.lengthValue("DescribeDcdnWafFilterInfoResponse.Content["+ i +"].Fields["+ j +"].LogicalSymbol.Length"); k++) {
					Logic logic = new Logic();
					logic.setType(_ctx.stringValue("DescribeDcdnWafFilterInfoResponse.Content["+ i +"].Fields["+ j +"].LogicalSymbol["+ k +"].Type"));
					logic.setSymbol(_ctx.stringValue("DescribeDcdnWafFilterInfoResponse.Content["+ i +"].Fields["+ j +"].LogicalSymbol["+ k +"].Symbol"));
					logic.setTip(_ctx.stringValue("DescribeDcdnWafFilterInfoResponse.Content["+ i +"].Fields["+ j +"].LogicalSymbol["+ k +"].Tip"));
					logic.setMaxLength(_ctx.integerValue("DescribeDcdnWafFilterInfoResponse.Content["+ i +"].Fields["+ j +"].LogicalSymbol["+ k +"].MaxLength"));
					logic.setDescription(_ctx.stringValue("DescribeDcdnWafFilterInfoResponse.Content["+ i +"].Fields["+ j +"].LogicalSymbol["+ k +"].Description"));

					Regexp regexp = new Regexp();
					regexp.setPattern(_ctx.stringValue("DescribeDcdnWafFilterInfoResponse.Content["+ i +"].Fields["+ j +"].LogicalSymbol["+ k +"].Regexp.Pattern"));
					regexp.setErrMsg(_ctx.stringValue("DescribeDcdnWafFilterInfoResponse.Content["+ i +"].Fields["+ j +"].LogicalSymbol["+ k +"].Regexp.ErrMsg"));
					logic.setRegexp(regexp);

					logicalSymbol.add(logic);
				}
				field.setLogicalSymbol(logicalSymbol);

				fields.add(field);
			}
			filterInfo.setFields(fields);

			content.add(filterInfo);
		}
		describeDcdnWafFilterInfoResponse.setContent(content);
	 
	 	return describeDcdnWafFilterInfoResponse;
	}
}