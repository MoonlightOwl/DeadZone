// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package su.u_c.deadzone.data.Move



@SerialVersionUID(0L)
final case class Move(
    direction: Int = 0
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[Move] with com.trueaccord.lenses.Updatable[Move] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (direction != 0) { __size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, direction) }
      __size
    }
    final override def serializedSize: Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: com.google.protobuf.CodedOutputStream): Unit = {
      {
        val __v = direction
        if (__v != 0) {
          _output__.writeInt32(1, __v)
        }
      };
    }
    def mergeFrom(`_input__`: com.google.protobuf.CodedInputStream): su.u_c.deadzone.data.Move.Move = {
      var __direction = this.direction
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __direction = _input__.readInt32()
          case tag => _input__.skipField(tag)
        }
      }
      su.u_c.deadzone.data.Move.Move(
          direction = __direction
      )
    }
    def withDirection(__v: Int): Move = copy(direction = __v)
    def getField(__field: com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = {
      __field.getNumber match {
        case 1 => {
          val __t = direction
          if (__t != 0) __t else null
        }
      }
    }
    override def toString: String = com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = su.u_c.deadzone.data.Move.Move
}

object Move extends com.trueaccord.scalapb.GeneratedMessageCompanion[su.u_c.deadzone.data.Move.Move] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[su.u_c.deadzone.data.Move.Move] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): su.u_c.deadzone.data.Move.Move = {
    require(__fieldsMap.keys.forall(_.getContainingType() == descriptor), "FieldDescriptor does not match message type.")
    val __fields = descriptor.getFields
    su.u_c.deadzone.data.Move.Move(
      __fieldsMap.getOrElse(__fields.get(0), 0).asInstanceOf[Int]
    )
  }
  def descriptor: com.google.protobuf.Descriptors.Descriptor = MoveProto.descriptor.getMessageTypes.get(0)
  def messageCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__field)
  def enumCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__field)
  lazy val defaultInstance = su.u_c.deadzone.data.Move.Move(
  )
  implicit class MoveLens[UpperPB](_l: com.trueaccord.lenses.Lens[UpperPB, su.u_c.deadzone.data.Move.Move]) extends com.trueaccord.lenses.ObjectLens[UpperPB, su.u_c.deadzone.data.Move.Move](_l) {
    def direction: com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.direction)((c_, f_) => c_.copy(direction = f_))
  }
  final val DIRECTION_FIELD_NUMBER = 1
}
