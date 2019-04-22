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

package com.aliyuncs.domain.transform.v20180129;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain.model.v20180129.LookupTmchNoticeResponse;
import com.aliyuncs.domain.model.v20180129.LookupTmchNoticeResponse.Claim;
import com.aliyuncs.domain.model.v20180129.LookupTmchNoticeResponse.Claim.ClassDesc;
import com.aliyuncs.domain.model.v20180129.LookupTmchNoticeResponse.Claim.Contact;
import com.aliyuncs.domain.model.v20180129.LookupTmchNoticeResponse.Claim.Contact.Addr1;
import com.aliyuncs.domain.model.v20180129.LookupTmchNoticeResponse.Claim.Holder;
import com.aliyuncs.domain.model.v20180129.LookupTmchNoticeResponse.Claim.Holder.Addr;
import com.aliyuncs.domain.model.v20180129.LookupTmchNoticeResponse.Claim.JurDesc;
import com.aliyuncs.transform.UnmarshallerContext;


public class LookupTmchNoticeResponseUnmarshaller {

	public static LookupTmchNoticeResponse unmarshall(LookupTmchNoticeResponse lookupTmchNoticeResponse, UnmarshallerContext context) {
		
		lookupTmchNoticeResponse.setRequestId(context.stringValue("LookupTmchNoticeResponse.RequestId"));
		lookupTmchNoticeResponse.setId(context.longValue("LookupTmchNoticeResponse.Id"));
		lookupTmchNoticeResponse.setNotBefore(context.stringValue("LookupTmchNoticeResponse.NotBefore"));
		lookupTmchNoticeResponse.setNotAfter(context.stringValue("LookupTmchNoticeResponse.NotAfter"));
		lookupTmchNoticeResponse.setLabel(context.stringValue("LookupTmchNoticeResponse.Label"));

		List<Claim> claims = new ArrayList<Claim>();
		for (int i = 0; i < context.lengthValue("LookupTmchNoticeResponse.Claims.Length"); i++) {
			Claim claim = new Claim();
			claim.setMarkName(context.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].MarkName"));
			claim.setGoodsAndServices(context.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].GoodsAndServices"));

			JurDesc jurDesc = new JurDesc();
			jurDesc.setJurCC(context.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].JurDesc.JurCC"));
			jurDesc.setDesc(context.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].JurDesc.Desc"));
			claim.setJurDesc(jurDesc);

			List<Holder> holders = new ArrayList<Holder>();
			for (int j = 0; j < context.lengthValue("LookupTmchNoticeResponse.Claims["+ i +"].Holders.Length"); j++) {
				Holder holder = new Holder();
				holder.setEntitlement(context.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].Holders["+ j +"].Entitlement"));
				holder.setOrg(context.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].Holders["+ j +"].Org"));

				Addr addr = new Addr();
				addr.setCity(context.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].Holders["+ j +"].Addr.City"));
				addr.setSp(context.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].Holders["+ j +"].Addr.Sp"));
				addr.setPc(context.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].Holders["+ j +"].Addr.Pc"));
				addr.setCc(context.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].Holders["+ j +"].Addr.Cc"));

				List<String> street = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("LookupTmchNoticeResponse.Claims["+ i +"].Holders["+ j +"].Addr.Street.Length"); k++) {
					street.add(context.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].Holders["+ j +"].Addr.Street["+ k +"]"));
				}
				addr.setStreet(street);
				holder.setAddr(addr);

				holders.add(holder);
			}
			claim.setHolders(holders);

			List<Contact> contacts = new ArrayList<Contact>();
			for (int j = 0; j < context.lengthValue("LookupTmchNoticeResponse.Claims["+ i +"].Contacts.Length"); j++) {
				Contact contact = new Contact();
				contact.setType(context.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].Contacts["+ j +"].Type"));
				contact.setName(context.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].Contacts["+ j +"].Name"));
				contact.setOrg(context.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].Contacts["+ j +"].Org"));
				contact.setVoice(context.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].Contacts["+ j +"].Voice"));
				contact.setFax(context.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].Contacts["+ j +"].Fax"));
				contact.setEmail(context.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].Contacts["+ j +"].Email"));

				Addr1 addr1 = new Addr1();
				addr1.setCity(context.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].Contacts["+ j +"].Addr.City"));
				addr1.setSp(context.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].Contacts["+ j +"].Addr.Sp"));
				addr1.setPc(context.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].Contacts["+ j +"].Addr.Pc"));
				addr1.setCc(context.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].Contacts["+ j +"].Addr.Cc"));

				List<String> street2 = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("LookupTmchNoticeResponse.Claims["+ i +"].Contacts["+ j +"].Addr.Street.Length"); k++) {
					street2.add(context.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].Contacts["+ j +"].Addr.Street["+ k +"]"));
				}
				addr1.setStreet2(street2);
				contact.setAddr1(addr1);

				contacts.add(contact);
			}
			claim.setContacts(contacts);

			List<ClassDesc> classDescs = new ArrayList<ClassDesc>();
			for (int j = 0; j < context.lengthValue("LookupTmchNoticeResponse.Claims["+ i +"].ClassDescs.Length"); j++) {
				ClassDesc classDesc = new ClassDesc();
				classDesc.setClassNum(context.integerValue("LookupTmchNoticeResponse.Claims["+ i +"].ClassDescs["+ j +"].ClassNum"));
				classDesc.setDesc(context.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].ClassDescs["+ j +"].Desc"));

				classDescs.add(classDesc);
			}
			claim.setClassDescs(classDescs);

			claims.add(claim);
		}
		lookupTmchNoticeResponse.setClaims(claims);
	 
	 	return lookupTmchNoticeResponse;
	}
}